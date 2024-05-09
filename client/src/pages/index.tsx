import { Route, Routes } from 'react-router-dom';
import { AuthPage } from './auth/ui/Page';
import { LeaderBoardPage } from './leaderboard';
import { MainPage } from './main/ui/Page';
import { ProfilePage } from './profile/ui/Page';
import { StorePage } from './store/ui/Page';
import { TasksCompletingPage } from './taskCompleting/ui/Page';
import { TasksPage } from './tasks/ui/Page';

export const Routing = () => {
	return (
		<Routes>
			<Route path='/' element={<MainPage />} />
			<Route path='/auth' element={<AuthPage />} />
			<Route path='/profile' element={<ProfilePage />} />
			<Route path='/tasks' element={<TasksPage />} />
			<Route path='/store' element={<StorePage />} />
			<Route path='/tasks/complete' element={<TasksCompletingPage />} />
			<Route path='/leaderboard' element={<LeaderBoardPage />} />
		</Routes>
	);
};
