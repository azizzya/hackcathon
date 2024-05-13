import './styles.scss';

import { MenuSVGComponent } from '@/shared/ui/SVGs/Menu.SVG.Component';
import { MessageSVGComponent } from '@/shared/ui/SVGs/Message.SVG.Component copy';
import { ProfileSVGComponent } from '@/shared/ui/SVGs/Profile.SVG.Component copy 3';
import { TaskSVGComponent } from '@/shared/ui/SVGs/Tasks.SVG.Component';

import { useLocation, useNavigate } from 'react-router-dom';

export const NavBar: React.FC = () => {
	const navigate = useNavigate();
	const location = useLocation();

	const activeIcon = location.pathname.split('/')[1] || '';

	const HandleIconClick = (iconId: string) => {
		navigate(`/${iconId}`);
	};

	return (
		<div className='navbar-wrapper'>
			<button 
				className='navbar-button' 
				onClick={() => HandleIconClick('')
			}>
				<MessageSVGComponent
					fillColor={activeIcon === '' ? '#6C33FF' : 'grey'}
					height='26px'
					width='26px'
				/>
			</button>

			<button
				className='navbar-button'
				onClick={() => HandleIconClick('tasks')}
			>
				<TaskSVGComponent
					fillColor={activeIcon === 'tasks' ? '#6C33FF' : 'grey'}
					height='26px'
					width='26px'
				/>
			</button>

			<button 
				className='navbar-button' 
				onClick={() => HandleIconClick('menu')
			}>
				<MenuSVGComponent
					fillColor={activeIcon === 'menu' ? '#6C33FF' : 'grey'}
					height='24px'
					width='26px'
				/>
			</button>

			<button
				className='navbar-button'
				onClick={() => HandleIconClick('profile')}
			>
				<ProfileSVGComponent
					fillColor={activeIcon === 'profile' ? '#6C33FF' : 'grey'}
					height='28px'
					width='28px'
				/>
			</button>
		</div>
	);
};
