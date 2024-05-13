export interface ITaskDetails {
	taskDetailId: number;
	taskDeadline: Date;
	timeCompletion: Date;
	id_done: boolean;
	task: ITask;
}

export interface ITask {
	taskId: number;
	title: string;
	coinReward: number;
	description: string;
}

export interface ITaskData extends Omit<ITask, 'id'> {}
export interface ITaskUpdateData extends Partial<ITaskData> {}
