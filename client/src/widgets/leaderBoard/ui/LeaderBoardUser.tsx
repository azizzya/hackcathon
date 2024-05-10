import img_path from '@/shared/assets/tama.png';
import { LeaderBoardUserProps } from '../model/interfaces';
import './styles.scss';

export const LeaderBoardUser: React.FC<LeaderBoardUserProps> = ({
	name,
	score,
	pos,
	login,
	surname,
}) => {
	return (
		<div className='leaderBoard-user-wrapper'>
			<div className='leaderBoard-user-item'>{`${pos}  – `}</div>
			<div className='leaderBoard-user-img-container'>
				<img
					className='leaderBoard-user-img'
					src={img_path}
					alt='Profile_img'
				></img>
			</div>
			<div className='leaderBoard-user-text-container'>
				<div className='leaderBoard-user-item'>{`${name} ${surname}`}</div>
				<div className='leaderBoard-user-item'>{login}</div>
			</div>
			<div className='leaderBoard-user-item'>{`${score} c`}</div>
		</div>
	);
};
