import { Route, Routes } from 'react-router-dom';
import { AuthPage } from './auth/ui/Page';
import { MainPage } from './main/ui/Page';
import { ProfilePage } from './profile/ui/Page';
import { StorePage } from './store/ui/Page';
import { TamagotchiPage } from './tamagotchi/ui/Page';
import { TasksPage } from './tasks/ui/Page';

export const Routing = () => {
	return (
		<Routes>
			<Route path='/' element={<MainPage />} />
			<Route path='/auth' element={<AuthPage />} />
			<Route path='/profile' element={<ProfilePage />} />
			<Route path='/tasks' element={<TasksPage />} />
			<Route path='/tamagotchi' element={<TamagotchiPage />} />
			<Route path='/store' element={<StorePage />} />
		</Routes>
	);
};
