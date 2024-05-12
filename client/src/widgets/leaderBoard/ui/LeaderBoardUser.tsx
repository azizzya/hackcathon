import img_path from '@/shared/assets/thug.jpg';
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
			<div className='leaderBoard-user-item-pos'>{`${pos}  – `}</div>
			<div className='leaderBoard-user-item-img-container'>
				<img
					className='leaderBoard-user-img'
					src={img_path}
					alt='Profile_img'
				></img>
			</div>

			<div className='leaderBoard-user-item-text-container'>
				<div className='leaderBoard-user-item-name'>{`${name} ${surname}`}</div>
				<div className='leaderBoard-user-item-login'>{login}</div>
			</div>

			<div className='leaderBoard-user-item-score'>{`${score} ¢`}</div>
		</div>
	);
};
