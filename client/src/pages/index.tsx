import Layout from '@/widgets/navBar/ui/Layout';
import { Route, Routes } from 'react-router-dom';

import { AuthPage } from './auth';
import { LeaderBoardPage } from './leaderboard';
import { MainPage } from './main';
import { MenuPage } from './menu';
import { ProfilePage } from './profile';
import { StorePage } from './store';
import { TasksCompletingPage } from './taskCompleting';
import { TasksPage } from './tasks';

export const Routing = () => {
	return (
		<Routes>
			<Route element={<Layout />}>
				<Route path='/' element={<MainPage />} />
				<Route path='/profile' element={<ProfilePage />} />
				<Route path='/menu' element={<MenuPage />} />
				<Route path='/tasks' element={<TasksPage />} />
				<Route path='/menu/store' element={<StorePage />} />
				<Route path='/menu/leaderboard' element={<LeaderBoardPage />} />
			</Route>
			<Route path='/auth' element={<AuthPage />} />
			<Route path='/tasks/complete' element={<TasksCompletingPage />} />
		</Routes>
	);
};
