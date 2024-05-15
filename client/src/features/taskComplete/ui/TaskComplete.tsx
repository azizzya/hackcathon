import { useUpdateTask } from '@/entities/task';
import FailPath from '@/shared/assets/gifs/failed-failure.gif';
import loadPath from '@/shared/assets/gifs/loading.gif';
import SuccessPath from '@/shared/assets/gifs/success.gif';
import { useEffect } from 'react';
import { useQueryParams } from '../helpers/useQueryParams';

export const TaskComplete: React.FC = () => {
	const task_id = useQueryParams();
	console.log(task_id);
	const updateMutation = useUpdateTask();

	useEffect(() => {
		updateMutation.mutate(+task_id);
	}, [task_id]);

	return updateMutation.isPending ? (
		<img src={loadPath} alt='GIF' />
	) : updateMutation.isError ? (
		<img src={FailPath} alt='GIF' />
	) : (
		<img src={SuccessPath} alt='GIF' />
	);
};
