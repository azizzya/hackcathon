import { useProducts } from '@/entities/product';
import { NavBar } from '@/widgets/navBar/ui/NavBar';

export const MainPage: React.FC = () => {
	const data = useProducts();

	return (
		<>
			<p>Tamagotchi</p>
			<img src='src/shared/assets/tama.png' />
			<NavBar />
		</>
	);
};
