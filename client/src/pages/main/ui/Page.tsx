import { NavBar } from '@/widgets/navBar/ui/NavBar';

export const MainPage: React.FC = () => {
	return (
		<>
			<p>Tamagotchi</p>
			<img src='src/shared/assets/tama.png' />
			<NavBar />
		</>
	);
};
