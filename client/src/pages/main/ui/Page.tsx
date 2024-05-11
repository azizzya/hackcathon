import { useTasks } from '@/entities/task/helpers/useTasks';

export const MainPage: React.FC = () => {
	const { data } = useTasks();
	console.log(data);
	return (
		<>
			<p>Tamagotchi</p>
			<img src='src/shared/assets/tama.png' />
		</>
	);
};
