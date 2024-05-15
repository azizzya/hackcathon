import { useNavigate } from 'react-router-dom';
import '../ui/style.scss'

export const MainPage: React.FC = () => {
	const navigate = useNavigate();
	return (
		<div className="page-wrapper">
			<div className="main-wrapper">
				<div className="tamagotchi-wrapper">
					
				</div>



				<button 
					className='primary-button chat-button' 
					onClick={() => navigate('/main/chat')	
				}>
					Перейти в чат!
				</button>
			</div>
		</div>
	);
};
