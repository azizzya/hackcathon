import './styles.scss';

import { useTasks } from '@/entities/task';
import { TasksList } from '@/features/TasksList';
import './styles.scss';
export const TasksListsContainer: React.FC = () => {
	const tasksQuery = useTasks();

	return (
		<div className='tasks'>
			<div className='tasks-block'>
				<h2>Активные</h2>
				{tasksQuery.isLoading ? (
					<div>loading</div>
				) : tasksQuery.isError ? (
					<div>error</div>
				) : tasksQuery.data ? (
					<TasksList type='active' tasks={tasksQuery.data.currentTasks} />
				) : (
					<div>1</div>
				)}
			</div>
			<div className='tasks-block'>
				<h2>Выполненные</h2>
				{tasksQuery.isLoading ? (
					<div>loading</div>
				) : tasksQuery.isError ? (
					<div>error</div>
				) : tasksQuery.data ? (
					<TasksList type='done' tasks={tasksQuery.data.completedTasks} />
				) : (
					<div>1</div>
				)}
			</div>
		</div>
	);
};
