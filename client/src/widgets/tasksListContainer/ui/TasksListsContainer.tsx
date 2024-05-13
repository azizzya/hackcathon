import './styles.scss'

import { TasksList } from '@/features/TasksList';
import { tasksData } from './data';

export const TasksListsContainer: React.FC = () => {
	const data = tasksData;

	const currentTasks = data.filter(task => task.id_done == false);
	const doneTasks = data.filter(task => task.id_done == true);

	return (
		<div className='tasks'>
			<div className='tasks-block'>
				<h2>Активные</h2>
				<TasksList type='active' tasks={currentTasks} />
			</div>
			<div className='tasks-block'>
				<h2>Выполненные</h2>
				<TasksList type='done' tasks={doneTasks} />
			</div>
		</div>
	);
};
