import { Routing } from '../pages';
import { withQueryClient } from './providers/with-queryClient';
import { withRouter } from './providers/with-router';
import './ui/global.scss';
const App = () => {
	return (
		<div className='global'>
			<Routing />
		</div>
	);
};

export default withQueryClient(withRouter(App));
