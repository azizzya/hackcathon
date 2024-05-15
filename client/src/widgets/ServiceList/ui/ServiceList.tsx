import '@/shared/ui/shared.scss';
import { LeaderBoardSVGComponent } from '@/shared/ui/SVGs/LeaderBoard.SVG.Component copy';
import { StoreSVGComponent } from '@/shared/ui/SVGs/Store.SVG.Component';
import { IServiceCardProps } from '../model/interfaces';
import { ServiceCard } from './ServiceCard';
import './styles.scss';
export const ServiceList: React.FC = () => {
	const services: IServiceCardProps[] = [
		{
			id: 1,
			text: 'Маркет',
			label: 'store',
			SVGComponent: StoreSVGComponent,
		},
		{
			id: 2,
			text: 'Лидерборд',
			label: 'leaderboard',
			SVGComponent: LeaderBoardSVGComponent,
		},
	];
	return (
		<div className='service-list-wrapper'>
			{services.map(service => (
				<ServiceCard key={service.id} {...service} />
			))}
		</div>
	);
};
