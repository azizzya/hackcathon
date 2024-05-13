import { TasksList } from '@/features/TasksList';
import { tasksData } from './data';

export const TasksListsContainer: React.FC = () => {
	const data = tasksData;

	const currentTasks = data.filter(task => task.id_done == false);
	const doneTasks = data.filter(task => task.id_done == true);

	return (
		<div className='tasks'>
			<div>
				<p>Активные</p>
				<TasksList type='active' tasks={currentTasks} />
			</div>
			<div>
				<p>Выполненные</p>
				<TasksList type='done' tasks={doneTasks} />
			</div>
		</div>
	);
};
