import '@/shared/ui/shared.scss';
import { TasksListsContainer } from '@/widgets/tasksListContainer';
import './styles.scss';
export const TasksPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<header className='tasks-page-header'>
				<div className='primary-title'>Задания</div>
			</header>
			<TasksListsContainer />
		</div>
	);
};
