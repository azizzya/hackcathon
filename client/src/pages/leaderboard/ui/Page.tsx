import { LeaderBoard } from '@/widgets/leaderBoard';

import { BackArrowButton } from '@/features/BackArrowButton';
import './syles.scss';
export const LeaderBoardPage: React.FC = () => {
	return (
		<div className='leaderboard-page-wrapper'>
			<header className='leaderboard-header'>
				<div className='leaderboard-header-arrow'>
					<BackArrowButton />
				</div>
				<div className='leaderboard-header-title'>
					<div className='primary-title'>Лидерборд</div>
				</div>
			</header>
			<LeaderBoard />
		</div>
	);
};
