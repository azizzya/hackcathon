import { useNavigate } from 'react-router-dom';
import './styles.scss';
export const NavBar: React.FC = () => {
	const navigate = useNavigate();

	return (
		<div className='navbar-wrapper'>
			<button className='navbar-button' onClick={() => navigate('/')}>
				main
			</button>
			<button className='navbar-button' onClick={() => navigate('/tasks')}>
				tasks
			</button>
			<button className='navbar-button' onClick={() => navigate('/store')}>
				store
			</button>
			<button className='navbar-button' onClick={() => navigate('/profile')}>
				profile
			</button>

			<button
				className='navbar-button'
				onClick={() => navigate('/leaderboard')}
			>
				leaderboard
			</button>
		</div>
	);
};
