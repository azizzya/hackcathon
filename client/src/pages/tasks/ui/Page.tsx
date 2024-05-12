import { useTasks } from '@/entities/task';
import { TasksList } from '@/widgets/tasksList';

export const TasksPage: React.FC = () => {
	const { data } = useTasks();
	console.log(data);
	return (
		<>
			<TasksList />
		</>
	);
};
