import { ITaskDetails } from '@/shared/interfaces/task.interfaces';

export const tasksData: ITaskDetails[] = [
	{
		taskDetailId: 1,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: false,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
	{
		taskDetailId: 2,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: false,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
	{
		taskDetailId: 3,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: false,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
	{
		taskDetailId: 4,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: true,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
	{
		taskDetailId: 5,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: true,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
	{
		taskDetailId: 6,
		taskDeadline: new Date('01-01-2024'),
		timeCompletion: new Date(),
		id_done: true,
		task: {
			taskId: 1,
			title: 'сходить в столовую',
			description: 'Узнай где столовая и отсканируй там QR код',
			coinReward: 25,
		},
	},
];
