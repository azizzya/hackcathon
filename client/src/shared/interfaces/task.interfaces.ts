export interface ITask {
	id: number;
	text: string;
	category: string;
	task_type: string;
	deadline: Date;
	reward_type: string;
	reward_amount: number; //возможно поменяется + возможно юзеры добавятся
	is_done: boolean;
}

export interface ITaskData extends Omit<ITask, 'id'> {}
