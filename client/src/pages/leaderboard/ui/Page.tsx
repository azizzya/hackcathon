import { LeaderBoard } from '@/widgets/leaderBoard';

import { BackArrowButton } from '@/features/BackArrowButton';
import './syles.scss';
export const LeaderBoardPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<header className='leaderboard-header'>
				<div className='leaderboard-header-arrow'>
					<BackArrowButton />
				</div>
				<div className='leaderboard-header-title'>
					<h1 className='primary-title'>Лидерборд</h1>
				</div>
			</header>
			<LeaderBoard />
		</div>
	);
};
