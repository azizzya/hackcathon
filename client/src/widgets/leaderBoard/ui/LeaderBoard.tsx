import { useLeaderBoard } from '@/entities/user';
import { LeaderBoardUser } from './LeaderBoardUser';
import './styles.scss';

export const LeaderBoard: React.FC = () => {
	const leaderBoardQuery = useLeaderBoard();
	return leaderBoardQuery.isLoading ? (
		<div>loading...</div>
	) : leaderBoardQuery.isError ? (
		<div>error</div>
	) : leaderBoardQuery.data ? (
		<div className='leaderBoard-wrapper'>
			{leaderBoardQuery.data.map((user, index) => (
				<LeaderBoardUser
					pos={index + 1}
					key={user.user_id}
					name={user.firstname}
					score={user.coin_balance}
					user_id={user.user_id}
					login={user.username}
					surname={user.lastname}
				/>
			))}
		</div>
	) : (
		<div>error</div>
	);
};
