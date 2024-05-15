import img_path from '@/shared/assets/secretarev.jpg';
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
			<div className='leaderBoard-user-item'>
				<div className='leaderBoard-user-item-pos'>
					<div className='leaderBoard-user-item-pos-num'>{pos}</div>
					<div className='leaderBoard-user-item-pos-dash'>–</div>
				</div>

				<div className='leaderBoard-user-item-img'>
					<img
						src={img_path}
						alt='Profile_img'
					></img>
				</div>

				<div className='leaderBoard-user-item-text'>
					<div className='leaderBoard-user-item-text-name'>{`${name} ${surname}`}</div>
					<div className='leaderBoard-user-item-text-login'>{login}</div>
				</div>
			</div>
			

			<div className='leaderBoard-user-item'>
				<div className='leaderBoard-user-item-score'>{`${score}¢`}</div>
			</div>
		</div>
	);
};
