import { LeaderBoardUserProps } from '../model/interfaces';
import './styles.scss';
export const LeaderBoardUser: React.FC<LeaderBoardUserProps> = ({
	name,
	score,
	pos,
}) => {
	return (
		<div className='leaderBoard-user-wrapper'>
			<div className='leaderBoard-user-item'>{pos}</div>
			<div className='leaderBoard-user-item'>{name}</div>
			<div className='leaderBoard-user-item'>{score}</div>
		</div>
	);
};
