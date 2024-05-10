import { LeaderBoardSVGComponent } from '@/shared/ui/SVGs/LeaderBoard.SVG.Component copy';
import { StoreSVGComponent } from '@/shared/ui/SVGs/Store.SVG.Component';
import { useNavigate } from 'react-router-dom';
import './styles.scss';

export const ServiceList: React.FC = () => {
	const navigate = useNavigate();
	return (
		<div className='services-container'>
			<div className='grid-element'>
				<button
					className='services-button'
					onClick={() => navigate('/menu/store')}
				>
					<StoreSVGComponent fillColor='black' height='50%' width='50%' />
				</button>
			</div>
			<div className='grid-element'>
				<button
					className='services-button'
					onClick={() => navigate('/menu/leaderboard')}
				>
					<LeaderBoardSVGComponent fillColor='black' height='50%' width='50%' />
				</button>
			</div>
			<div className='grid-element'>3</div>
			<div className='grid-element'>4</div>
			<div className='grid-element'>1</div>
			<div className='grid-element'>2</div>
			<div className='grid-element'>3</div>
			<div className='grid-element'>4</div>
		</div>
	);
};
