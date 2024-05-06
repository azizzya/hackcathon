import { ITaskData } from '@/shared/interfaces/task.interfaces';
import './styles.scss';

export const Task: React.FC<ITaskData> = (
	{ text, is_done },
	onClickHandler: () => void
) => {
	return (
		<div className='task-wrapper'>
			<div className='task-title'>{text}</div>
			{!is_done && <button className='task-decline-btn'>❌</button>}
		</div>
	);
};
