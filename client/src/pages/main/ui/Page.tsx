import { useProducts } from '@/entities/product';

export const MainPage: React.FC = () => {
	const { data } = useProducts();
	console.log(data);
	return (
		<>
			<p>Tamagotchi</p>
			<img src='src/shared/assets/tama.png' />
		</>
	);
};
