import { ITaskDetails } from '@/shared/interfaces/task.interfaces';

export interface ITasksListProps {
	type: string;
	tasks: ITaskDetails[];
}
