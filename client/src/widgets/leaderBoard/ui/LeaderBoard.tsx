import { ILeaderBoardUser } from '../model/interfaces';
import { LeaderBoardUser } from './LeaderBoardUser';
import './styles.scss';
const data: ILeaderBoardUser[] = [
	{
		user_id: 1,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 2,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 3,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 4,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 5,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 6,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 7,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 8,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 9,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 10,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 11,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
	{
		user_id: 12,
		name: 'Панки',
		score: 5554,
		login: '@friendly',
		surname: 'ХОЙ',
	},
];
33;
2;
33;

export const LeaderBoard: React.FC = () => {
	// const leaderBoardQuery = useLeaderBoard();
	// return leaderBoardQuery.isLoading ? (
	// 	<div>loading...</div>
	// ) : leaderBoardQuery.isError ? (
	// 	<div>error</div>
	// ) : leaderBoardQuery.data ? (
	// 	<div className='leaderBoard-wrapper'>
	// 		{leaderBoardQuery.data.map((user, index) => (
	// 			<LeaderBoardUser
	// 				pos={index + 1}
	// 				key={user.user_id}
	// 				name={user.firstname}
	// 				score={user.coin_balance}
	// 				user_id={user.user_id}
	// 				login={user.username}
	// 				surname={user.lastname}
	// 			/>
	// 		))}
	// 	</div>
	// ) : (
	// 	<div>error</div>
	// );
	//когда будет готов бек
	return (
		<div className='leaderBoard-wrapper'>
			{data.map((user, index) => (
				<LeaderBoardUser
					pos={index + 1}
					key={user.user_id}
					name={user.name}
					score={user.score}
					user_id={user.user_id}
					login={user.login}
					surname={user.surname}
				/>
			))}

			{/* {
				<LeaderBoardUser
					pos={1}
					key={data[0].user_id}
					name={data[0].name}
					score={data[0].score}
					user_id={data[0].user_id}
					login={data[0].login}
					surname={data[0].surname}
				/>
			} */}
		</div>
	);
};
