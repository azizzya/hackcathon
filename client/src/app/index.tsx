import { Routing } from '../pages';
import { withQueryClient } from './providers/with-queryClient';
import { withRouter } from './providers/with-router';

const App = () => {
	return <Routing />;
};

export default withQueryClient(withRouter(App));
