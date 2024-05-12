import '@/shared/ui/shared.scss';
import { ServiceList } from '@/widgets/ServiceList';
export const MenuPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<h1>Ещё</h1>
			<ServiceList />
		</div>
	);
};
