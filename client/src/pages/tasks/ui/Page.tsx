import '@/shared/ui/shared.scss';
import { TasksListsContainer } from '@/widgets/tasksListContainer';
import './styles.scss';
export const TasksPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<header className='tasks-page-header'>
				<h1 className='primary-title'>Задания</h1>
			</header>
			<TasksListsContainer />
		</div>
	);
};
