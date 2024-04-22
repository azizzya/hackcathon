import instance from '@/shared/api/axios.api';
import { ITask, ITaskRequest } from '@/shared/interfaces/task.interfaces';

class TaskService {
	async getAll() {
		return await instance.get<ITask[]>('tasks');
	}

	async getOne(id: number) {
		return instance.get<ITask>(`tasks/${id}`);
	}

	async addTask(task: ITask) {
		return instance.post<ITask>('tasks', task);
	}

	async deleteTask(id: number) {
		return instance.delete<ITask>(`tasks/${id}`);
	}

	async updateTask(id: number, newTask: ITaskRequest) {
		return instance.patch<ITask>(`tasks/${id}`, newTask);
	}
	//возможно возвращаемые типы поменяются потом
}

export const taskService = new TaskService();
