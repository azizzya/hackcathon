import { useNavigate } from 'react-router-dom';
import './styles.scss';

import { MessageSVGComponent } from '@/shared/ui/Message.SVG.Component copy';
import { ProfileSVGComponent } from '@/shared/ui/Profile.SVG.Component copy 3';
import { StoreSVGComponent } from '@/shared/ui/Store.SVG.Component';
import { ThingsSVGComponent } from '@/shared/ui/Things.SVG.Component';
import { useState } from 'react';

export const NavBar: React.FC = () => {
	const navigate = useNavigate();

	const [activeIcon, setActiveIcon] = useState<string>('');

	const HandleIconClick = (iconId: string) => {
		navigate(`/${iconId}`);
		setActiveIcon(iconId);
	};

	return (
		<div className='navbar-wrapper'>
			<button className='navbar-button' onClick={() => HandleIconClick('')}>
				<MessageSVGComponent
					fillColor={activeIcon === '' ? 'purple' : 'grey'}
				/>
			</button>
			<button
				className='navbar-button'
				onClick={() => HandleIconClick('store')}
			>
				<StoreSVGComponent
					fillColor={activeIcon === 'store' ? 'purple' : 'grey'}
				/>
			</button>
			<button
				className='navbar-button'
				onClick={() => HandleIconClick('things')}
			>
				<ThingsSVGComponent
					fillColor={activeIcon === 'things' ? 'purple' : 'grey'}
				/>
			</button>
			<button
				className='navbar-button'
				onClick={() => HandleIconClick('profile')}
			>
				<ProfileSVGComponent
					fillColor={activeIcon === 'profile' ? 'purple' : 'grey'}
				/>
			</button>

			{/* <button
				className='navbar-button'
				onClick={() => navigate('/leaderboard')}
			>
				leaderboard
			</button> */}
		</div>
	);
};
