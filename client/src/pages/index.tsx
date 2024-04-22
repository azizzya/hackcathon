import { Route, Routes } from 'react-router-dom';
import { AuthPage } from './auth/ui/Page';
import { MainPage } from './main/ui/Page';
import { NewsPage } from './news/ui/Page';
import { ProfilePage } from './profile/ui/Page';
import { TasksPage } from './tasks/ui/Page';

export const Routing = () => {
	return (
		<Routes>
			<Route path='/' element={<MainPage />} />
			<Route path='/auth' element={<AuthPage />} />
			<Route path='/news' element={<NewsPage />} />
			<Route path='/profile' element={<ProfilePage />} />
			<Route path='/tasks' element={<TasksPage />} />
		</Routes>
	);
};
