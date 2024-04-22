export interface ITask {
	id: number;
	text: string;
	category: string;
	task_type: string;
	deadline: Date;
	reward_type: string;
	reward_amount: number; //возможно поменяется + возможно юзеры добавятся
}

export interface ITaskRequest extends Omit<ITask, 'id'> {}
