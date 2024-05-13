import { ITaskCardProps } from '../model/interfaces';
import './styles.scss';

export const TaskCard: React.FC<ITaskCardProps> = (
	{ task, id_done, type },
	onClickHandler: () => void
) => {
	return (
		<div className={`task-wrapper-${type}`}>
			<div className='task-title'>{task.title}</div>
		</div>
	);
};
