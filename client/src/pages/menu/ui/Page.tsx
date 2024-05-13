import '@/shared/ui/shared.scss';
import { ServiceList } from '@/widgets/ServiceList';
import './styles.scss';
export const MenuPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<header className='menu-header'>
				<div className='primary-title'>Ещё</div>
			</header>
			<ServiceList />
		</div>
	);
};
