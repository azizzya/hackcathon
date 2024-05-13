import { TasksList } from '@/features/TasksList';
import { tasksData } from './data';
import './styles.scss';
export const TasksListsContainer: React.FC = () => {
	// const tasksQuery = useTasks();

	//когда бек будет готов раскомментить верхнее и закомментить убрать нижнее
	const data = tasksData;
	const currentTasks = data.filter(task => task.is_done == false);
	const doneTasks = data.filter(task => task.is_done == true);

	return (
		<div className='tasks-lists-container'>
			<div>
				<div className='tasks-list-title'>Активные</div>
				<TasksList type='active' tasks={currentTasks} />
				{/* поменять, когда бек будет готов */}
				{/* {tasksQuery.isLoading ? (
					<div>loading</div>
				) : tasksQuery.isError ? (
					<div>error</div>
				) : tasksQuery.data ? (
					<TasksList
						type='active'
						//tasks={tasksQuery.data.currentTasks}
						tasks={currentTasks}
					/>
				) : (
					<div>1</div>
				)} */}
			</div>
			<div>
				<div className='tasks-list-title'>Выполненные</div>
				<TasksList type='done' tasks={doneTasks} />
				{/* поменять, когда бек будет готов */}
				{/* {tasksQuery.isLoading ? (
					<div>loading</div>
				) : tasksQuery.isError ? (
					<div>error</div>
				) : tasksQuery.data ? (
					<TasksList
						type='active'
						tasks={doneTasks}
					/>
				) : (
					<div>1</div>
				)} */}
			</div>
		</div>
	);
};
