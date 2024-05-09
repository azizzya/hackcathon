import { LeaderBoard } from '@/widgets/leaderBoard';
import { NavBar } from '@/widgets/navBar';

export const LeaderBoardPage: React.FC = () => {
	return (
		<>
			<div>
				<LeaderBoard />
			</div>
			<NavBar />
		</>
	);
};
