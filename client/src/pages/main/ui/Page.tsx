import { useNavigate } from 'react-router-dom';

export const MainPage: React.FC = () => {
	const navigate = useNavigate();
	return (
		<>
			<p>Tamagotchi</p>
			<img src='src/shared/assets/tama.png' />
			<button onClick={() => navigate('/main/chat')}>chat!</button>
		</>
	);
};
