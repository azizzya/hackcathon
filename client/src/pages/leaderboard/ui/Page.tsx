import { LeaderBoard } from '@/widgets/leaderBoard';
import './syles.scss';
export const LeaderBoardPage: React.FC = () => {
	return (
		<>
			<div>
				<div className='leaderboard-title'>Лидерборд</div>
				<LeaderBoard />
			</div>
		</>
	);
};
