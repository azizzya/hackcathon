export interface ITaskDetails {
	taskDetailId: number;
	taskDeadline: Date;
	timeCompletion: Date;
	is_done: boolean;
	task: ITask;
}

export interface ITask {
	taskId: number;
	title: string;
	coinReward: number;
	description: string;
}

export interface ITaskDetailsData extends Omit<ITask, 'id'> {}
export interface ITaskDetailsUpdateData extends Partial<ITaskDetails> {}
