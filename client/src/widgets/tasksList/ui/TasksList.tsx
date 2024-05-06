import { Task } from '@/entities/task/ui/Task';
import { data } from './data';

export const TasksList: React.FC = () => {
	const tasks = data;
	const currentTasks = tasks.filter(task => task.is_done == false);
	const doneTasks = tasks.filter(task => task.is_done == true);
	return (
		<>
			<p>Активные</p>
			<div>
				{currentTasks.map(currentTask => (
					<Task key={currentTask.id} {...currentTask} />
				))}
			</div>
			<p>завершенные</p>
			<div>
				{doneTasks.map(doneTask => (
					<Task key={doneTask.id} {...doneTask} />
				))}
			</div>
		</>
	);
};
