import { Route, Routes } from 'react-router-dom';
import { MainPage } from './main/ui/Page';

export const Routing = () => {
	return (
		<Routes>
			<Route path='/' element={<MainPage />} />
		</Routes>
	);
};
