import { useUpdateTask } from '@/entities/task';
import FailPath from '@/shared/assets/failed-failure.gif';
import loadPath from '@/shared/assets/loading.gif';
import SuccessPath from '@/shared/assets/success.gif';
import { useQueryParams } from '../helpers/useQueryParams';
export const TaskComplete: React.FC = () => {
	const task_id = useQueryParams();
	const updateMutation = useUpdateTask();

	if (task_id) {
		updateMutation.mutate(+task_id);
	}

	return updateMutation.isPending ? (
		<img src={loadPath} alt='GIF' />
	) : updateMutation.isError ? (
		<img src={FailPath} alt='GIF' />
	) : (
		<img src={SuccessPath} alt='GIF' />
	);
};
