export interface ITaskDetails {
	taskDetailId: number;
	taskDeadline: Date;
	timeCompletion: Date;
	done: boolean;
	task: ITask;
}

export interface ITask {
	taskId: number;
	title: string;
	coinReward: string;
	description: string;
}

export interface ITaskData extends Omit<ITask, 'id'> {}
export interface ITaskUpdateData extends Partial<ITaskData> {}
