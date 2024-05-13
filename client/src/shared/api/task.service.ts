import instance from '@/shared/api/axios.api';
import { ITask, ITaskUpdateData } from '@/shared/interfaces/task.interfaces';

class TaskService {
	async getAll() {
		return await instance.get<ITask[]>('tasks/details');
	}

	async getOne(id: number) {
		return await instance.get<ITask>(`tasks/${id}`);
	}

	async add(task: ITask) {
		return await instance.post<ITask>('tasks', task);
	}

	async delete(id: number) {
		return await instance.delete<ITask>(`tasks/${id}`);
	}

	async updateTask(id: number, newTask: ITaskUpdateData) {
		return await instance.patch<ITask>(`tasks/${id}`, newTask);
	}
}

export const taskService = new TaskService();
