import instance from '@/shared/api/axios.api';
import {
	ITaskDetails,
	ITaskDetailsUpdateData,
} from '@/shared/interfaces/task.interfaces';

class TaskService {
	async getAll() {
		return await instance.get<ITaskDetails[]>('tasks/details');
	}

	async updateTask(newTask: ITaskDetailsUpdateData) {
		return await instance.patch<ITaskDetails>(
			`tasks/details/complete`,
			newTask
		);
	}
}

export const taskService = new TaskService();
