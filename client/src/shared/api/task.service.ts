import instance from '@/shared/api/axios.api';
import { ITask, ITaskData } from '@/shared/interfaces/task.interfaces';

class TaskService {
	async getAll() {
		return await instance.get<ITask[]>('tasks');
	}

	async getOne(id: number) {
		return instance.get<ITask>(`tasks/${id}`);
	}

	async add(task: ITask) {
		return instance.post<ITask>('tasks', task);
	}

	async delete(id: number) {
		return instance.delete<ITask>(`tasks/${id}`);
	}

	async updateTask(id: number, newTask: ITaskData) {
		return instance.patch<ITask>(`tasks/${id}`, newTask);
	}
	//возможно возвращаемые типы поменяются потом
}

export const taskService = new TaskService();
