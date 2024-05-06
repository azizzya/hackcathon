import { NavBar } from '@/widgets/navBar/ui/NavBar';
import { TasksList } from '@/widgets/tasksList';

export const TasksPage: React.FC = () => {
	return (
		<>
			<TasksList />
			<NavBar />
		</>
	);
};
