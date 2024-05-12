import { useTasks } from '@/entities/task';
import { Task } from '@/entities/task/ui/Task';

export const TasksList: React.FC = () => {
	const { data } = useTasks();
	let currentTasks = [];
	let doneTasks = [];
	if (data) {
		currentTasks = data.filter(task => task.taskDetails.done == false);
		doneTasks = data.filter(task => task.taskDetails.done == true);
	}

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
