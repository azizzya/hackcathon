import { TaskCard } from '@/entities/task';
import { ITasksListProps } from '../model/interfaces';
import './styles.scss';
export const TasksList: React.FC<ITasksListProps> = ({ tasks, type }) => {
	return (
		<div className='tasks-container'>
			{tasks.map(task => (
				<TaskCard key={task.taskDetailId} type={type} {...task} />
			))}
		</div>
	);
};
